package cl.binter.challenge.infrastructure.controller;

import cl.binter.challenge.domain.entities.Task;
import cl.binter.challenge.usecase.ScheduleGenerator;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

	private static final String TASKS = "/tasks";
	private ScheduleGenerator scheduleGenerator;

	@Operation(summary = "Get a list of random task to schedule")
	@ApiResponse(responseCode = "200", description = "List with schedules",
		content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Task.class))})
	@GetMapping(value = TASKS, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> getNearbyByCoordinates() throws Exception {

		return ok(scheduleGenerator.generateTaskList());
	}

	@Autowired
	public void setTextFinder(ScheduleGenerator scheduleGenerator) {
		this.scheduleGenerator = scheduleGenerator;
	}
}
