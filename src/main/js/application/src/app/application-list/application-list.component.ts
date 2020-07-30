import {DataSource} from '@angular/cdk/collections';
import { CdkTableModule} from '@angular/cdk/table';
import { Component, OnInit } from '@angular/core';
import { Application } from '../model/application';
import { ApplicationService } from '../service/application-service.service';
import {MatTableModule} from '@angular/material/table';
import {BehaviorSubject, Observable} from 'rxjs';

@Component({
  selector: 'app-application-list',
  templateUrl: './application-list.component.html',
  styleUrls: ['./application-list.component.css']
})


export class ApplicationListComponent implements OnInit {
  displayedColumns: string[] = ['name', 'mail'];
  applications: Application[];
  constructor(private applicationService: ApplicationService) {

  }

  ngOnInit() {
    console.log('Iniciando');
    this.applicationService.findAll().subscribe(data => {
      this.applications = data;
    });
  }
  dataSource = this.applications;
}
