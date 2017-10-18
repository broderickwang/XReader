package marc.com.news.UI;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import marc.com.news.R;
import marc.com.news.contract.NewsInfoContract;
import marc.com.news.presenter.NewsInfoPresenter;

public class NewsActivity extends AppCompatActivity implements NewsInfoContract.View {


	private NewsInfoContract.Presenter mPresenter;
	private ViewPager mNewsviewpager;
	private TabLayout mNewstablayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_activity_main);
		this.mNewstablayout = (TabLayout) findViewById(R.id.news_tablayout);
		this.mNewsviewpager = (ViewPager) findViewById(R.id.news_viewpager);

		mPresenter = new NewsInfoPresenter(this);

		mPresenter.createAdapter(getSupportFragmentManager());
		mPresenter.setAdapter();
	}

	@Override
	public void setAdapter(PagerAdapter pagerAdapter) {
		mNewsviewpager.setAdapter(pagerAdapter);
		mNewstablayout.setupWithViewPager(mNewsviewpager);
	}
}
