package springrepositories.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import springrepositories.entities.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}