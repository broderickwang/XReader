package marc.com.news.presenter;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import marc.com.baselibrary.net.EngineCallback;
import marc.com.baselibrary.net.HttpUtil;
import marc.com.news.R;
import marc.com.news.adapter.NewsMainItemAdapter;
import marc.com.news.bean.MainBean;
import marc.com.news.contract.NewsFragmentContract;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 16:10
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public class NewsFragmentPresenter implements NewsFragmentContract.Presenter {
	private NewsFragmentContract.View mView;

	private NewsMainItemAdapter mNewsMainItemAdapter;

	public NewsFragmentPresenter(NewsFragmentContract.View view) {
		mView = view;
	}

	@Override
	public void setAdapter() {
		mView.setAdapter(mNewsMainItemAdapter);
	}

	@Override
	public void createAdapter(Context context) {
		mNewsMainItemAdapter = new NewsMainItemAdapter(context,null, R.layout.news_item_message);
	}

	@Override
	public void getData(Context context) {
		HttpUtil.getInstance()
				.with(context)
				.type(HttpUtil.GET)
				.url("http://baobab.kaiyanapp.com/api/v4/tabs/selected")
				.callback(new EngineCallback() {
					@Override
					public void onPreExcute() {

					}

					@Override
					public void onError(Exception e) {

					}

					@Override
					public void onSuccess(String result) {
						Log.d("TAG", "onSuccess: "+result);
						Gson gson = new Gson();
						MainBean bean = gson.fromJson(result, MainBean.class);
						mNewsMainItemAdapter.setmDatas(bean.getItemList());
						mNewsMainItemAdapter.notifyDataSetChanged();
					}
				})
				.excute();
	}
}
