package marc.com.news.presenter;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

import marc.com.news.R;
import marc.com.news.adapter.NewsPageAdapter;
import marc.com.news.contract.NewsInfoContract;
import marc.com.news.model.NewsInfoModel;
import marc.com.news.util.Util;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 13:47
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public class NewsInfoPresenter implements NewsInfoContract.Presenter {
	private NewsInfoContract.View mView;

	private NewsPageAdapter mPagerAdapter;

	public NewsInfoPresenter(NewsInfoContract.View view) {
		mView = view;
	}

	@Override
	public void createAdapter(FragmentManager fm) {

		mPagerAdapter = new NewsPageAdapter(fm);
		mPagerAdapter.setNewsInfoModels(createModels());
	}

	private List<NewsInfoModel> createModels() {
		List<NewsInfoModel> list = new ArrayList<>();
		for (int i = 0; i < Util.mCategeories.length; i++) {
			Util.CATEGORY category = Util.mCategeories[i];
			list.add(new NewsInfoModel(category.getKey(),category.getTitle()));
		}
		return list;
	}

	@Override
	public void setAdapter() {
		mView.setAdapter(mPagerAdapter);
	}
}
