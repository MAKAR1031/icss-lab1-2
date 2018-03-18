package ru.makar.icss.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.makar.icss.lab1.domain.Medicine;
import ru.makar.icss.lab1.repository.MedicineRepository;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

@Component
public class DataLoader implements CommandLineRunner {

    private final MedicineRepository repository;

    @Autowired
    public DataLoader(MedicineRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.save(new Medicine("Аспирин", valueOf(5.5), "Жаропонижающее"));
        repository.save(new Medicine("Парацетамол", valueOf(3.8), "Жаропонижающее"));
        repository.save(new Medicine("Нурофен", valueOf(89), "Обезболивающее"));
        repository.save(new Medicine("Анальгин", valueOf(14), "Обезболивающее"));
        repository.save(new Medicine("Мелаксен", valueOf(750), "Снотворное"));
    }
}
