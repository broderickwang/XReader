package marc.com.news.contract;

import android.content.Context;

import marc.com.news.adapter.NewsMainItemAdapter;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 16:10
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public interface NewsFragmentContract {
	interface Model {
	}

	interface View {
		void setAdapter(NewsMainItemAdapter newsMainItemAdapter);
	}

	interface Presenter {
		void setAdapter();

		void createAdapter(Context context);

		void getData(Context context);
	}
}
