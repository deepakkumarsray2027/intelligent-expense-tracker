package com.expensetracker.service;

import com.expensetracker.entity.Expense;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public void saveExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    public Expense getExpenseById(Long id) {
        Optional<Expense> optional = expenseRepository.findById(id);
        return optional.orElse(null);
    }

    public void deleteExpenseById(Long id) {
        expenseRepository.deleteById(id);
    }
}
