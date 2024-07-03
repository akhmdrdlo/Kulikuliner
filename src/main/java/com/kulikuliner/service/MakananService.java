package com.kulikuliner.service;

import com.kulikuliner.data.entity.Makanan;
import java.util.List;

public interface MakananService {
    List<Makanan> getAllMakanan();
    Makanan getMakananById(Long mkn_id);

    Makanan saveMakanan(Makanan newMakanan);

    Makanan updateMakanan(Makanan updateMakanan, Long mkn_id);

    void deleteMakanan(Long mkn_id);

    

}
