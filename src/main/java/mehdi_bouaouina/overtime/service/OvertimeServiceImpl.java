package mehdi_bouaouina.overtime.service;

import mehdi_bouaouina.overtime.Repository.EmployeeRepository;
import mehdi_bouaouina.overtime.Repository.OvertimeRepository;
import mehdi_bouaouina.overtime.Repository.PriceRepository;
import mehdi_bouaouina.overtime.dto.OvertimeResponseDto;
import mehdi_bouaouina.overtime.model.entity.Employee;
import mehdi_bouaouina.overtime.model.entity.Overtime;
import mehdi_bouaouina.overtime.model.entity.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OvertimeServiceImpl implements IOvertimeService{
    @Autowired
    OvertimeRepository overtimeRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PriceRepository priceRepository;

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Overtime> findAllOvertimes() {
        return overtimeRepository.findAll();
    }

    @Override
    public Overtime addOvertime(Overtime overtime) {
        return overtimeRepository.save(overtime);
    }

    @Override
    public List<OvertimeResponseDto> findOvertimePerEmployeeByDate(Date startDate , Date endDate)
    {
        return overtimeRepository.findOvertimePerEmployeeByDate(startDate,endDate);
    }

    @Override
    public List<Price> findAllPrices() {
        return priceRepository.findAll();
    }


}
