package filipe.pires.me.mvpexample;


public interface MainActivityContract {

    interface View {

        void printActionOne();

        void printActionTwo();
    }

    interface Events {

        void onActionTwoClicked();

        void onActionOneClicked();
    }
}
