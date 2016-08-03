package android.whitewidget.com.boilerplateandroid.presenters;


public interface BasePresenter {
    void setup();
    void updateState();
    void setState(int state);

    interface SystemInterface{

    }

    interface ScreenInterface{

    }
}
