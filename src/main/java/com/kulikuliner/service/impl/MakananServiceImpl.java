package com.kulikuliner.service.impl;

import org.springframework.stereotype.Service;
import com.kulikuliner.service.MakananService;
import com.kulikuliner.data.entity.Makanan;
import com.kulikuliner.data.repository.MakananRepository;

import java.util.List;

@Service
public class MakananServiceImpl implements MakananService {
    private MakananRepository makananRepository;

    public MakananServiceImpl(MakananRepository makananRepository) {
        this.makananRepository = makananRepository;
    }

    @Override
    public List<Makanan> getAllMakanan(){
        return makananRepository.findAll();
    }

    @Override
    public Makanan getMakananById(Long id) {
        return makananRepository.findById(id).orElse(null);
    }

    @Override
    public Makanan saveMakanan(Makanan newMakanan){
        return makananRepository.save(newMakanan);
    }

    @Override
    public Makanan updateMakanan(Makanan updatedMakanan, Long mkn_id){
        return makananRepository.findById(mkn_id).map(makanan -> {
            makanan.setNama_makanan(updatedMakanan.getNama_makanan());
            makanan.setAsal(updatedMakanan.getAsal());
            makanan.setHarga(updatedMakanan.getHarga());
            makanan.setDeskripsi(updatedMakanan.getDeskripsi());
            return makananRepository.save(makanan);
        }).orElse(null);
    }

    @Override
    public void deleteMakanan(Long mkn_id) {
        makananRepository.deleteById(mkn_id);
    }
}