.class public Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Z

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/Relation;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/Relation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/s;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/s;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;-><init>(Z)V

    return-void
.end method

.method constructor <init>(IZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/ContextData;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/Relation;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/Relation;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->a:I

    iput-boolean p2, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->b:Z

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->d:Ljava/util/ArrayList;

    iput-object p5, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->a:I

    iput-boolean p1, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->b:Z

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->a:I

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->b:Z

    return v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/ContextData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/Relation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/Relation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/s;->a(Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;Landroid/os/Parcel;I)V

    return-void
.end method
