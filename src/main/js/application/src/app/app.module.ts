import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { ApplicationListComponent } from './application-list/application-list.component';
import { ApplicationFormComponent } from './application-form/application-form.component';
import { ApplicationService } from './service/application-service.service';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {DataSource} from '@angular/cdk/collections';
import { MatTableModule } from '@angular/material/table';





@NgModule({
  declarations: [
    AppComponent,
    ApplicationListComponent,
    ApplicationFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MatTableModule
    ],
  providers: [ApplicationService],
  bootstrap: [AppComponent]
  })

export class AppModule { }
