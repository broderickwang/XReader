package marc.com.news.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

import marc.com.baselibrary.net.EngineCallback;
import marc.com.baselibrary.net.HttpUtil;
import marc.com.news.R;
import marc.com.news.adapter.NewsMainItemAdapter;
import marc.com.news.contract.NewsFragmentContract;
import marc.com.news.presenter.NewsFragmentPresenter;
import retrofit2.http.POST;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 14:22
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public class NewsFragment extends Fragment implements NewsFragmentContract.View {

	private String mKey;
	private String mTitle;

	private NewsFragmentContract.Presenter mPresenter;

	private RecyclerView mRecyclerView;

	public static NewsFragment newInstance(String key,String title) {

		Bundle args = new Bundle();
		args.putString("key",key);
		args.putString("title",title);
		NewsFragment fragment = new NewsFragment();
		fragment.setArguments(args);
		return fragment;
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.news_fragment_page,container,false);
		/*mRecyclerView = view.findViewById(R.id.news_recyclerview);
		mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));*/

		/*mPresenter.createAdapter(getContext());
		mPresenter.setAdapter();

		Log.d("TAG", "onCreateView: -------");
		mPresenter.getData(getContext());*/

		return view;
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle args = getArguments();
		if(args != null){
			mKey = args.getString("key");
			mTitle = args.getString("title");
		}

		mPresenter = new NewsFragmentPresenter(this);
	}

	@Override
	public void setAdapter(NewsMainItemAdapter newsMainItemAdapter) {
//		mRecyclerView.setAdapter(newsMainItemAdapter);
	}
}
