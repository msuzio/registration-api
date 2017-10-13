package net.suzio.helloworld.registration.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import net.suzio.helloworld.registration.model.Attendee;

@EnableJpaRepositories
public interface AttendeeRepository extends CrudRepository<Attendee, String> {

}
