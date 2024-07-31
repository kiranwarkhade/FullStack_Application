//package com.ex.WhatsApp.repository;

package com.ex.WhatsApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.WhatsApp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
