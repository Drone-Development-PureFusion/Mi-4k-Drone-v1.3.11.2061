.class public Lcom/google/android/gms/drive/events/QueryResultEventParcelable;
.super Lcom/google/android/gms/drive/WriteAwareParcelable;

# interfaces
.implements Lcom/google/android/gms/drive/events/DriveEvent;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/drive/events/n;


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/common/data/DataHolder;

.field final c:Z

.field final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/events/n;

    invoke-direct {v0}, Lcom/google/android/gms/drive/events/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->CREATOR:Lcom/google/android/gms/drive/events/n;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/common/data/DataHolder;ZI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/drive/WriteAwareParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->a:I

    iput-object p2, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->b:Lcom/google/android/gms/common/data/DataHolder;

    iput-boolean p3, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->c:Z

    iput p4, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->d:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public a(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/events/n;->a(Lcom/google/android/gms/drive/events/QueryResultEventParcelable;Landroid/os/Parcel;I)V

    return-void
.end method

.method public b()Lcom/google/android/gms/common/data/DataHolder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->b:Lcom/google/android/gms/common/data/DataHolder;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->c:Z

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/drive/events/QueryResultEventParcelable;->d:I

    return v0
.end method
