package marc.com.news.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import java.util.List;
import marc.com.news.fragment.NewsFragment;
import marc.com.news.model.NewsInfoModel;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 14:18
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public class NewsPageAdapter extends FragmentPagerAdapter {

	private List<NewsInfoModel> mNewsInfoModels;

	public NewsPageAdapter(FragmentManager fm) {
		super(fm);
	}

	public void setNewsInfoModels(List<NewsInfoModel> newsInfoModels) {
		mNewsInfoModels = newsInfoModels;
	}

	@Override
	public int getCount() {
		return mNewsInfoModels==null?0:mNewsInfoModels.size();
	}

	@Override
	public Fragment getItem(int position) {
		return NewsFragment.newInstance(mNewsInfoModels.get(position).getKey(),mNewsInfoModels.get(position).getTitle());
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view==object;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return mNewsInfoModels.get(position).getTitle();
	}
}
