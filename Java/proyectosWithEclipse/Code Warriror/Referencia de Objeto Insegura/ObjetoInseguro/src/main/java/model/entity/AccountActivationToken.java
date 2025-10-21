package model.entity;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

import lombok.Setter;
import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@Builder					//para que esta clase tenga el llamado con el punt (.)
@NoArgsConstructor			//constructor default
@AllArgsConstructor			//Constructor with all fileds
@Table
public class AccountActivationToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable= false, unique= true)
	private String token;
	
	@Column(name = "user_id")
	@NotNull
	private Long userId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = true, updatable = false, insertable = false)
	private User user;
		
	@Column(name = "expiry_date", nullable = false)
	private Date expiryDate;
	
	public void setExpiryDate(int minutes) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MINUTE, minutes);
		this.expiryDate = now.getTime();
	}
	
	public boolean isExpired() {
		return new Date().after(this.expiryDate);
	}
}
