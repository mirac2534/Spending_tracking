package com.harcama_takip.Harcama.takip.services;

import com.harcama_takip.Harcama.takip.entities.Expense;
import com.harcama_takip.Harcama.takip.repositories.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> addExpenses(List<Expense> expenses) {
        return expenseRepository.saveAll(expenses);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense updateExpense(int id, Expense updatedExpense) {
        Expense existingExpense = expenseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found with id " + id));
        existingExpense.setAmount(updatedExpense.getAmount());
        existingExpense.setCategory(updatedExpense.getCategory());
        existingExpense.setDescription(updatedExpense.getDescription());
        existingExpense.setCreatedAt(updatedExpense.getCreatedAt());
        return expenseRepository.save(existingExpense);
    }

    public void deleteExpense(int id) {
        expenseRepository.deleteById(id);
    }
}
