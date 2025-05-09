package com.harcama_takip.Harcama.takip.repositories;

import com.harcama_takip.Harcama.takip.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
