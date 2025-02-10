package com.qaisarabbas.readwrite.repository;

import com.qaisarabbas.readwrite.annotations.DataSource;
import com.qaisarabbas.readwrite.entities.Customers;
import com.qaisarabbas.readwrite.util.DataSourceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
    @DataSource(value = DataSourceType.SLAVE)
    List<Customers> findAll();
}
