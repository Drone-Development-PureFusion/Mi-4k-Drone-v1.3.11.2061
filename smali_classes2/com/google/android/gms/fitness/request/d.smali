.class public Lcom/google/android/gms/fitness/request/d;
.super Lcom/google/android/gms/fitness/request/ag$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/d$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/fitness/request/a;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/fitness/request/a;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/fitness/request/ag$a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/request/a;

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/d;->a:Lcom/google/android/gms/fitness/request/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/a;Lcom/google/android/gms/fitness/request/d$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/d;-><init>(Lcom/google/android/gms/fitness/request/a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/d;->a:Lcom/google/android/gms/fitness/request/a;

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/request/a;->a()V

    return-void
.end method

.method public a(Lcom/google/android/gms/fitness/data/BleDevice;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/d;->a:Lcom/google/android/gms/fitness/request/a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/request/a;->a(Lcom/google/android/gms/fitness/data/BleDevice;)V

    return-void
.end method
