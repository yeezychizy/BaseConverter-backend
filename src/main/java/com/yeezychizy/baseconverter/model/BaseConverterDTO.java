package com.yeezychizy.baseconverter.model;


// Frontend understands JSON
// Backend understands Java
// DTO -  Data transfer object (language translation)
public class BaseConverterDTO {

    //Fields definition
    private String inputNumber; //16 -> 17
    private String outputNumber;
    private int inputBase;
    private int outputBase;

    // Constructor definition
    public BaseConverterDTO(String inputNumber, String outputNumber, int inputBase, int outputBase) {
        this.inputNumber = inputNumber;
        this.outputNumber = outputNumber;
        this.inputBase = inputBase;
        this.outputBase = outputBase;
    }

    // Another constructor definition
    public BaseConverterDTO() {
    }

    // Getter abd setter definition - get value and set value
    public String getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    public String getOutputNumber() {
        return outputNumber;
    }

    public void setOutputNumber(String outputNumber) {
        this.outputNumber = outputNumber;
    }

    public int getInputBase() {
        return inputBase;
    }

    public void setInputBase(int inputBase) {
        this.inputBase = inputBase;
    }

    public int getOutputBase() {
        return outputBase;
    }

    public void setOutputBase(int outputBase) {
        this.outputBase = outputBase;
    }
}