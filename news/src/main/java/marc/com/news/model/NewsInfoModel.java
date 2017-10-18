package marc.com.news.model;

import marc.com.news.contract.NewsInfoContract;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 13:47
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public class NewsInfoModel implements NewsInfoContract.Model {
	String mKey;
	String mTitle;

	public NewsInfoModel(String key, String title) {
		mKey = key;
		mTitle = title;
	}

	public String getKey() {
		return mKey;
	}

	public void setKey(String key) {
		mKey = key;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}
}
