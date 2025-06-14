package com.example.nhom6btlon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ServiceFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate layout fragment_service.xml
        View view = inflater.inflate(R.layout.fragment_service, container, false);

        // Sau này bạn có thể thêm code tại đây
        // Ví dụ: ImageView img1 = view.findViewById(R.id.image_service1);

        return view;
    }
}
