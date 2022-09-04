.class public Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private b:Lcom/google/android/gms/fitness/data/DataSource;

.field private c:Lcom/google/android/gms/fitness/data/DataType;

.field private final d:Landroid/app/PendingIntent;

.field private final e:Lcom/google/android/gms/internal/alq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/y;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/y;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Landroid/app/PendingIntent;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->b:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    iput-object p4, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->d:Landroid/app/PendingIntent;

    invoke-static {p5}, Lcom/google/android/gms/internal/alq$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/alq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->e:Lcom/google/android/gms/internal/alq;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Landroid/app/PendingIntent;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->a:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->b:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->d:Landroid/app/PendingIntent;

    invoke-static {p4}, Lcom/google/android/gms/internal/alq$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/alq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->e:Lcom/google/android/gms/internal/alq;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->a(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->b(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;)Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;->c(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;)Landroid/app/PendingIntent;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;-><init>(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest$a;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p1, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->b:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v2, p1, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->d:Landroid/app/PendingIntent;

    invoke-direct {p0, v0, v1, v2, p2}, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;Landroid/app/PendingIntent;Landroid/os/IBinder;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->b:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->b:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->d:Landroid/app/PendingIntent;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->d:Landroid/app/PendingIntent;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->b:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public c()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->d:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public d()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->e:Lcom/google/android/gms/internal/alq;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->e:Lcom/google/android/gms/internal/alq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/alq;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->a(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->b:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->d:Landroid/app/PendingIntent;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataSource"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->b:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataType"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->c:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "pendingIntent"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;->d:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/y;->a(Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;Landroid/os/Parcel;I)V

    return-void
.end method
