package com.ledlau.test.adapter;

import android.content.Context;

import com.ledlau.test.R;
import com.ledlau.test.model.User;
import com.ledlau.widgets.HorizontalPageAdapter;
import com.ledlau.widgets.ViewHolder;

import java.util.List;

/**
 * Created by jianling on 2017/4/24.
 */

public class Myadapter extends HorizontalPageAdapter<User> {
    private Context mContext;


    public Myadapter(Context context, List<User> data) {
        super(context, data, R.layout.item_gridview);
        mContext = context;
    }


    @Override
    public void bindViews(ViewHolder holder, User user, int i) {

        holder.getConvertView().setBackgroundResource(R.drawable.selector_grid_view_bg);
        holder.setText(R.id.user_name, user.getName())
        .setImageUrl(R.id.page_image,"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493616261&di=cbef38fc423ee1c6fef38ab67830448d&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01b2a856f1ef166ac7257d207d8a1a.jpg%40900w_1l_2o_100sh.jpg");

    }
}
