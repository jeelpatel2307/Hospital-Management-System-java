class Patient:
    def __init__(self, patient_id, name, age, gender, contact):
        self.patient_id = patient_id
        self.name = name
        self.age = age
        self.gender = gender
        self.contact = contact

    def display_details(self):
        print(f"Patient ID: {self.patient_id}")
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Gender: {self.gender}")
        print(f"Contact: {self.contact}")


class Doctor:
    def __init__(self, doctor_id, name, specialization, contact):
        self.doctor_id = doctor_id
        self.name = name
        self.specialization = specialization
        self.contact = contact

    def display_details(self):
        print(f"Doctor ID: {self.doctor_id}")
        print(f"Name: {self.name}")
        print(f"Specialization: {self.specialization}")
        print(f"Contact: {self.contact}")


class Appointment:
    def __init__(self, patient, doctor, appointment_date, time):
        self.patient = patient
        self.doctor = doctor
        self.appointment_date = appointment_date
        self.time = time

    def display_details(self):
        print("Appointment Details:")
        print("Patient Details:")
        self.patient.display_details()
        print("\nDoctor Details:")
        self.doctor.display_details()
        print(f"\nAppointment Date: {self.appointment_date}")
        print(f"Time: {self.time}")


def main():
    # Create patients
    patient1 = Patient(101, "Alice", 30, "Female", "1234567890")
    patient2 = Patient(102, "Bob", 45, "Male", "9876543210")

    # Create doctors
    doctor1 = Doctor(201, "Dr. Smith", "Cardiologist", "987654321")
    doctor2 = Doctor(202, "Dr. Johnson", "Neurologist", "123456789")

    # Schedule appointments
    appointment1 = Appointment(patient1, doctor1, "2022-01-20", "10:00 AM")
    appointment2 = Appointment(patient2, doctor2, "2022-01-21", "11:00 AM")

    # Display appointment details
    appointment1.display_details()
    print("\n--------------------------------------------\n")
    appointment2.display_details()


if __name__ == "__main__":
    main()
