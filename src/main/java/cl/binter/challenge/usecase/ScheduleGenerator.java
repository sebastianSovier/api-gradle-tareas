package cl.binter.challenge.usecase;

import cl.binter.challenge.domain.entities.Task;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
@Slf4j
public class ScheduleGenerator {

	public List<Task> generateTaskList() {
		List<Task> tasks = new ArrayList<>();

		Random rnd = new Random();

		int taskQty = rnd.nextInt(10) + 5;

		for (int i = 0; i < taskQty; i++) {
			tasks.add(generateTask(String.format("Task %d", i)));
		}

		return tasks;
	}

	private Task generateTask(String name) {
		Random rnd = new Random();
		UUID uuid = UUID.randomUUID();


		return Task.builder()
			.taskId(uuid.toString())
			.taskName(name)
			.duration(rnd.nextInt(6) + 3)
			.build();
	}

}
