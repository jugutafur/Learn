import React from 'react';
import { Divider, List, Typography } from 'antd';

const data = [
  'Racing car sprays burning fuel into crowd.',
  'Japanese princess to wed commoner.',
  'Australian walks 100km after outback crash.',
  'Man charged over missing wedding girl.',
  'Los Angeles battles huge wildfires.',
];

const ListGifs = ({valueGif}) => {
	return(
		<List
			header={<div>Header</div>}
			footer={<div>Footer</div>}
			bordered
			dataSource={valueGif}
			renderItem={(item, index) => (
				<List.Item>
					<Typography.Text mark>{index+1}</Typography.Text> {item}
				</List.Item>
			)}
		/>
	)
}

export default ListGifs;