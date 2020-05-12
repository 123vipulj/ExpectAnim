package com.github.florent37.expectanim.sample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import com.github.florent37.expectanim.ExpectAnim;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.github.florent37.expectanim.core.Expectations.invisible;


public class ExpectAnimSetNowActivity extends AppCompatActivity {

    @BindView(R.id.follow)
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expectanim_activity_set_now);
        ButterKnife.bind(this);

        new ExpectAnim()
                .expect(view)
                .toBe(
                        invisible()
                )
                .toAnimation()
                .setNow();

    }

}
