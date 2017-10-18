package marc.com.news.contract;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 13:47
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public interface NewsInfoContract {
	interface Model {
	}

	interface View {
		void setAdapter(PagerAdapter pagerAdapter);
	}

	interface Presenter {
		void createAdapter(FragmentManager fm);

		void setAdapter();
	}
}
