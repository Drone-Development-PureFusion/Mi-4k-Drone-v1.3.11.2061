.class public Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl$Inclusion;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl$Inclusion;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/o;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/o;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/util/ArrayList;Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl$Inclusion;",
            ">;",
            "Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->a:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->c:Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->a:I

    return v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl$Inclusion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->c:Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->b:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->b:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;->b:Ljava/util/ArrayList;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/o;->a(Lcom/google/android/gms/contextmanager/internal/RelationFilterImpl;Landroid/os/Parcel;I)V

    return-void
.end method
