package use_case.clear_users;

public class ClearInteractor implements ClearInputBoundary{


    final ClearUserDataAccessInterface userDataAccessInterface;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearPresenter){
        this.userDataAccessInterface = userDataAccessInterface;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {
        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessInterface.allUsernames());
        userDataAccessInterface.clear();
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
