import { render, screen, fireEvent } from '@testing-library/react';
import { ItemsLoading } from '../../../../../components/Platzi/Stateloadings/ItemsLoading/ItemsLoading';

describe('test by component <ItemsLoading />', () =>{
  test('component exist in case loading', () =>{
    render(<ItemsLoading />);
    const itemsloadingContent = screen.getByText(/loading2..../);
    expect(itemsloadingContent).toBeInTheDocument();
  });
});