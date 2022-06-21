package pr.senac.br.feednac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pr.senac.br.feednac.models.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long>{}