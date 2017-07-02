package filipe.pires.me.mvpexample;


public class MainActivityPresenter implements MainActivityContract.Events {

    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void onActionTwoClicked() {
        view.printActionTwo();
    }

    @Override
    public void onActionOneClicked() {
        view.printActionOne();
    }
}
