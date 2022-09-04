.class public Lcom/google/android/gms/drive/query/internal/HasFilter;
.super Lcom/google/android/gms/drive/query/internal/AbstractFilter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/drive/query/internal/AbstractFilter;"
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/drive/query/internal/i;


# instance fields
.field final a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field final b:I

.field final c:Lcom/google/android/gms/drive/metadata/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/a",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/query/internal/i;

    invoke-direct {v0}, Lcom/google/android/gms/drive/query/internal/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/query/internal/HasFilter;->CREATOR:Lcom/google/android/gms/drive/query/internal/i;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/drive/query/internal/AbstractFilter;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->b:I

    iput-object p2, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    invoke-static {p2}, Lcom/google/android/gms/drive/query/internal/e;->a(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)Lcom/google/android/gms/drive/metadata/a;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->c:Lcom/google/android/gms/drive/metadata/a;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/metadata/c;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/drive/metadata/c",
            "<TT;>;TT;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p1, p2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Lcom/google/android/gms/drive/metadata/a;Ljava/lang/Object;)Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/drive/query/internal/HasFilter;-><init>(ILcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->a:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    iget-object v1, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->c:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Lcom/google/android/gms/drive/metadata/a;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/drive/query/internal/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/drive/query/internal/f",
            "<TF;>;)TF;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->c:Lcom/google/android/gms/drive/metadata/a;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/query/internal/HasFilter;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/drive/query/internal/f;->a(Lcom/google/android/gms/drive/metadata/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/i;->a(Lcom/google/android/gms/drive/query/internal/HasFilter;Landroid/os/Parcel;I)V

    return-void
.end method
