.class public Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/k;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->a:I

    iput-boolean p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->b:Z

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->a:I

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->b:Z

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;->c:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/k;->a(Lcom/google/android/gms/contextmanager/fence/internal/FenceTriggerInfoImpl;Landroid/os/Parcel;I)V

    return-void
.end method
