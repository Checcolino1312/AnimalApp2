package com.example.animalapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.animalapp.Fragment.Home_Ente_Fragment;
import com.example.animalapp.Fragment.Home_Veterinario_Fragment;

public class My_Adapter extends FragmentStateAdapter {

    public My_Adapter(@NonNull Home_Ente_Fragment fragment) {
        super(fragment);
    }

    public My_Adapter(@NonNull Home_Veterinario_Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Home_Veterinario_Fragment(); // Sostituisci con il tuo fragment per il veterinario
            case 1:
                return new Home_Ente_Fragment(); // Sostituisci con il tuo fragment per l'ente
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
