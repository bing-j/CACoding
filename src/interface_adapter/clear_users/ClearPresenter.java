package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
//        On success, update clearViewModel to reflect that.

        ClearState state = clearViewModel.getState();
        state.setUsersDeleted(clearOutputData.getUsersDeleted());
        clearViewModel.setState(state);

        clearViewModel.firePropertyChanged();
    }
}
