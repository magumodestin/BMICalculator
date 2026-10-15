import tkinter as tk

def calculate_bmi():
    try:
        weight = float(weight_entry.get())
        height = float(height_entry.get())
        bmi = weight / (height * height)
        result_label.config(text=f"Your BMI is: {bmi:.2f}")
    except ValueError:
        result_label.config(text="Invalid input!")

# Create window
root = tk.Tk()
root.title("BMI...")
root.geometry("300x180")

# Weight
weight_label = tk.Label(root, text="Weight (kg):")
weight_label.grid(row=0, column=0, padx=5, pady=5, sticky="w")

weight_entry = tk.Entry(root, width=15)
weight_entry.grid(row=0, column=1, padx=5, pady=5)

# Height
height_label = tk.Label(root, text="Height (m):")
height_label.grid(row=1, column=0, padx=5, pady=5, sticky="w")

height_entry = tk.Entry(root, width=15)
height_entry.grid(row=1, column=1, padx=5, pady=5)

# Button
calculate_btn = tk.Button(root, text="Calculate BMI", command=calculate_bmi)
calculate_btn.grid(row=2, column=0, padx=5, pady=10, sticky="w")

# Result
result_label = tk.Label(root, text="Your BMI is: --")
result_label.grid(row=3, column=0, columnspan=2, padx=5, pady=5, sticky="w")

root.mainloop()
