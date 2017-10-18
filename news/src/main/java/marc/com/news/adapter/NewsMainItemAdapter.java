package marc.com.news.adapter;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import marc.com.multrecycleadapter.CommonRecycleAdapter;
import marc.com.multrecycleadapter.MultiTypeSupport;
import marc.com.multrecycleadapter.ViewHolder;
import marc.com.news.R;
import marc.com.news.bean.MainBean;

/**
 * Created by chengda
 * Date: 2017/10/18
 * Time: 15:16
 * Version: 1.0
 * Description:
 * Email:wangchengda1990@gmail.com
 **/
public class NewsMainItemAdapter extends CommonRecycleAdapter<MainBean.ItemListBean> {

	private int mLayoutId;

	public NewsMainItemAdapter(Context context, List<MainBean.ItemListBean> datas, int layoutId) {
		super(context, datas, layoutId);
		mLayoutId = layoutId;
	}

	public NewsMainItemAdapter(Context context, List<MainBean.ItemListBean> datas, MultiTypeSupport multiTypeSupport) {
		super(context, datas, multiTypeSupport);
	}

	@Override
	public void convert(ViewHolder holder, MainBean.ItemListBean item) {
		holder.setText(R.id.news_message_title,item.getData().getTitle());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(item.getData().getReleaseTime());
		Log.d("TAG", "convert: "+simpleDateFormat.format(date));
		holder.setText(R.id.news_message_time,simpleDateFormat.format(date));
		holder.setImageByUrl(R.id.news_message_pic, new ViewHolder.ImageLoader(item.getData().getCover().getFeed()) {
			@Override
			public void displayImage(Context context, ImageView imageView, String imagePath) {
				Glide.with(context).load(imagePath).into(imageView);
			}
		});
	}


	@Override
	public int getLayoutId(Object item, int position) {
		return mLayoutId;
	}
}
