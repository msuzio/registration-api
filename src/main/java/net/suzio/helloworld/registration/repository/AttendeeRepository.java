package net.suzio.helloworld.registration.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;

import net.suzio.helloworld.registration.model.Attendee;

@EnableJpaRepositories
public interface AttendeeRepository extends PagingAndSortingRepository<Attendee, String> {
}
