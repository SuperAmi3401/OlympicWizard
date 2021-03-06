package chizaitongji.example.com.chizaitongji.Widgets;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;

/**
 * Created by Mi HD on 2018/3/24.
 */

public class ImageViewHolder implements Holder<Integer> {


    private ImageView imageView;

    @Override
    public View createView(Context context) {
        imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    @Override
    public void UpdateUI(Context context, int position, Integer data) {

        imageView.setImageResource(data);
    }
}
