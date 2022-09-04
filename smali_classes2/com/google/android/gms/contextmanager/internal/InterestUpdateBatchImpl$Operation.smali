.class public Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Operation"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lcom/google/android/contextmanager/interest/InterestRecordStub;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/k;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILcom/google/android/contextmanager/interest/InterestRecordStub;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->a:I

    iput p2, p0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->b:I

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->c:Lcom/google/android/contextmanager/interest/InterestRecordStub;

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->a:I

    return v0
.end method

.method b()Lcom/google/android/contextmanager/interest/InterestRecordStub;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->c:Lcom/google/android/contextmanager/interest/InterestRecordStub;

    return-object v0
.end method

.method c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;->b:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/k;->a(Lcom/google/android/gms/contextmanager/internal/InterestUpdateBatchImpl$Operation;Landroid/os/Parcel;I)V

    return-void
.end method
