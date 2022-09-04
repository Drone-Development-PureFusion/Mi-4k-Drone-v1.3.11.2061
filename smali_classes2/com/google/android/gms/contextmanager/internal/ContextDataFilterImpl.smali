.class public Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;",
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
            "Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/a;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/internal/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->a:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->d:Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->d:Lcom/google/android/gms/contextmanager/internal/QueryFilterParameters;

    return-object v0
.end method

.method d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->b:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->b:Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->c:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->c:Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->b:Ljava/util/ArrayList;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->c:Ljava/util/ArrayList;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "contexts=["

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;

    invoke-virtual {v0}, Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl$Inclusion;->c()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ","

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/a;->a(Lcom/google/android/gms/contextmanager/internal/ContextDataFilterImpl;Landroid/os/Parcel;I)V

    return-void
.end method
