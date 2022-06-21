package pr.senac.br.feednac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pr.senac.br.feednac.models.Feedback;
import pr.senac.br.feednac.repositories.FeedbackRepository;

@RestController
@RequestMapping("/api")
public class FeedbackController {

    @Autowired
    FeedbackRepository feedbackRepository;

    @GetMapping("/feedbacks")
    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @PostMapping("/feedbacks")
    public Feedback createFeedback(@RequestBody Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @GetMapping("/feedbacks/{id}")
    public Feedback getFeedbackById(@PathVariable(value = "id") Long feedbackId) {
        return feedbackRepository.findById(feedbackId).orElseThrow(
        );
    }

    @DeleteMapping("/feedbacks/{id}")
    public ResponseEntity<?> deleteFeedback(@PathVariable(value = "id") Long FeedbackId) {
        Feedback Feedback = feedbackRepository.findById(FeedbackId)
                .orElseThrow();

        feedbackRepository.delete(Feedback);

        return ResponseEntity.ok().build();
    }
}
