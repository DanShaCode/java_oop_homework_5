package ru.sharipov;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class WorkerCompanyData implements CompanyData {

    private List<Worker> workerList;

    public WorkerCompanyData() {
        this.workerList = new ArrayList<>();
    }

    @Override
    public void add(Worker worker) {
        this.workerList.add(worker);
    }

    @Override
    public void remove(int id) {
        Iterator<Worker> workerIterator = workerList.iterator();
        while (workerIterator.hasNext()) {
            Worker worker = workerIterator.next();
            if (worker.getCurrentId() == id) {
                workerIterator.remove();
                break;
            }
        }
    }

    @Override
    public void changeData(Integer inputMenu, Integer inputId, String newData) {
        if (inputMenu == 1) {
            for (Worker worker : workerList) {
                if (worker.getCurrentId() == inputId)
                    worker.setFirstName(newData);
            }
        }
        if (inputMenu == 2) {
            for (Worker worker : workerList) {
                if (worker.getCurrentId() == inputId)
                    worker.setSecondName(newData);
            }
        }
        if (inputMenu == 3) {
            for (Worker worker : workerList) {
                if (worker.getCurrentId() == inputId)
                    worker.setRank(newData);
            }
        }
        if (inputMenu == 4) {
            for (Worker worker : workerList) {
                if (worker.getCurrentId() == inputId)
                    worker.setSalary(Double.parseDouble(newData));
            }
        }
        if (inputMenu == 5) {
            for (Worker worker : workerList) {
                if (worker.getCurrentId() == inputId)
                    worker.setAge(Integer.parseInt(newData));
            }
        }
    }

}
