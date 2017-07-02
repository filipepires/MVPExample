package filipe.pires.me.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private MainActivityContract.Events presenter;
    private TextView actionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_action_one).setOnClickListener(onActionOneClickListener);
        findViewById(R.id.button_action_two).setOnClickListener(onActionTwoClickListener);
        actionText = (TextView) findViewById(R.id.actionText);

        presenter = new MainActivityPresenter(this);
    }

    private OnClickListener onActionTwoClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            presenter.onActionTwoClicked();
        }
    };

    private OnClickListener onActionOneClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            presenter.onActionOneClicked();
        }
    };

    @Override
    public void printActionOne() {
        actionText.setText(R.string.action_one_text);
    }

    @Override
    public void printActionTwo() {
        actionText.setText(R.string.action_two_text);
    }
}
