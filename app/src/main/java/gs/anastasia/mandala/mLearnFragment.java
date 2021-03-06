package gs.anastasia.mandala;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import gs.anastasia.mandala.lesson.Basic1;


/**
 * Fragment class for each nav menu item
 */
public class mLearnFragment extends Fragment {
    private String mText;
    private int mColor;

    private View mContent;
    private ScrollView mScrollView;

    public static Fragment newInstance(String text, int color) {
        Fragment frag = new mLearnFragment();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_m_learn, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ImageView profileImage;
        super.onViewCreated(view, savedInstanceState);


        // initialize views
        mContent = view.findViewById(R.id.mLearnFragment);
        mScrollView = (ScrollView) view.findViewById(R.id.sView);

        view.setBackgroundResource(R.drawable.mandalabackground);

        final View aboutMandala = view.findViewById(R.id.aboutMandala);
        aboutMandala.setOnClickListener((View v) -> {
                Intent intent = new Intent(getActivity(), AboutMandala.class);
                startActivity(intent);
        });

        final View basic1 = view.findViewById(R.id.basic1);
        basic1.setOnClickListener((View v)->{
            Intent intent = new Intent(getActivity(), Basic1.class);
            startActivity(intent);
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}