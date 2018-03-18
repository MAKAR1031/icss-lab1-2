package ru.makar.icss.lab1.repository;

import org.springframework.data.repository.CrudRepository;
import ru.makar.icss.lab1.domain.Medicine;

public interface MedicineRepository extends CrudRepository<Medicine, Long> {
}
